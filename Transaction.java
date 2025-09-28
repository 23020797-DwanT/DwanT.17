/**
 * Lớp mô tả một giao dịch gồm loại thao tác, số tiền và số dư tài khoản sau giao dịch.
 */
public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    /** Hằng số biểu thị giao dịch nạp tiền. */
    public static final String DEPOSIT = "deposit";
    /** Hằng số biểu thị giao dịch rút tiền. */
    public static final String WITHDRAW = "withdraw";

    /**
     * Tạo một giao dịch mới với thông tin được cung cấp.
     *
     * @param operation loại giao dịch, {@link #DEPOSIT} hoặc {@link #WITHDRAW}
     * @param amount số tiền của giao dịch
     * @param balance số dư tài khoản sau giao dịch
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Trả về mô tả tiếng Việt của loại giao dịch.
     *
     * @return {@code "Nap tien"} nếu loại là {@link #DEPOSIT},
     *         {@code "Rut tien"} nếu loại là {@link #WITHDRAW},
     *         hoặc {@code "Không xác định"} nếu không hợp lệ
     */
    public String getOperation() {
        if (operation.equals(DEPOSIT)) {
            return "Nap tien";
        }
        if (operation.equals(WITHDRAW)) {
            return "Rut tien";
        }
        return "Không xác định";
    }

    /**
     * Thiết lập loại giao dịch.
     *
     * @param operation loại giao dịch cần đặt
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Lấy số tiền của giao dịch.
     *
     * @return số tiền giao dịch
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Thiết lập số tiền của giao dịch.
     *
     * @param amount số tiền giao dịch cần đặt
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Lấy số dư tài khoản sau giao dịch.
     *
     * @return số dư tài khoản
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Thiết lập số dư tài khoản sau giao dịch.
     *
     * @param balance số dư tài khoản cần đặt
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
