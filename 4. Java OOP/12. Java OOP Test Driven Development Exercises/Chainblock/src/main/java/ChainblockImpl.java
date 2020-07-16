import java.util.stream.Collectors;

public class ChainblockImpl implements Chainblock {

    private Map<Integer, Transaction> transactionsByIds;

    public ChainblockImpl() {
        this.transactionsByIds = new HashMap<>();
    }

    private List<Transaction> getTransactionsByStatusOrderedByAmountAsList(TransactionStatus status) {
        List<Transaction> transactions = new ArrayList<>();
        getByTransactionStatus(status).forEach(transactions::add);
        return transactions;
    }

    public int getCount() {
        return this.transactionsByIds.size();
    }

    public void add(Transaction transaction) {
        //Check if not present and add or do nothing
        if (!contains(transaction)) {
            this.transactionsByIds.put(transaction.getId(), transaction);
        }
    }

    public boolean contains(Transaction transaction) {
        return contains(transaction.getId());
    }

    public boolean contains(int id) {
        return this.transactionsByIds.containsKey(id);
    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        validateTransactionContainsId(id);
        this.transactionsByIds.get(id).setStatus(newStatus);
    }

    public void removeTransactionById(int id) {
        validateTransactionContainsId(id);
        this.transactionsByIds.remove(id);
    }

    private void validateTransactionContainsId(int id) {
        if (!contains(id)) {
            throw new IllegalArgumentException();
        }
    }

    public Transaction getById(int id) {
        validateTransactionContainsId(id);
        return this.transactionsByIds.get(id);
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> sorted = new ArrayList<>();
        for (Transaction t : transactionsByIds.values()) {
            if (t.getStatus() == status) {
                sorted.add(t);
            }
        }
        if (sorted.size() == 0) {
            throw new IllegalArgumentException();
        }
        sorted.sort(Comparator.comparing(Transaction::getAmount).reversed());
        return sorted;
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        return getTransactionsByStatusOrderedByAmountAsList(status).stream()
                .map(Transaction::getFrom)
                .collect(Collectors.toList());
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        return getTransactionsByStatusOrderedByAmountAsList(status).stream()
                .map(Transaction::getTo)
                .collect(Collectors.toList());
    }

    public List<Transaction> getAllOrderedByAmountDescendingThenById() {
        return this.transactionsByIds.values()
                .stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed()
                        .thenComparing(Transaction::getId))
                .collect(Collectors.toList());
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        List<Transaction> transactions = new ArrayList<>();
        for (Transaction transaction : transactionsByIds.values()) {
            if (transaction.getFrom().equals(sender)) {
                transactions.add(transaction);
            }
        }
        if (transactions.size() == 0) {
            throw new IllegalArgumentException();
        }
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getAmount)
                        .reversed())
                .collect(Collectors.toList());
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        List<Transaction> transactions = new ArrayList<>();
        for (Transaction transaction : transactionsByIds.values()) {
            if (transaction.getTo().equals(receiver)) {
                transactions.add(transaction);
            }
        }
        if (transactions.size() == 0) {
            throw new IllegalArgumentException();
        }
        return transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed()
                        .thenComparing(Transaction::getId))
                .collect(Collectors.toList());
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        List<Transaction> transactions = getTransactionsByStatusOrderedByAmountAsList(status);
        return transactions.stream()
                .filter(t -> t.getAmount() <= amount)
                .collect(Collectors.toList());
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return null;
    }

    public Iterator<Transaction> iterator() {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChainblockImpl that = (ChainblockImpl) o;
        return Objects.equals(transactionsByIds, that.transactionsByIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionsByIds);
    }
}
