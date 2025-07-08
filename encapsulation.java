class Detail {
    private Long account_no;
    private String name, gmail;
    private float amount;

    public Long getAcc_no() {
        return account_no;
    }

    public void setAcc_no(Long account_no) {
        this.account_no = account_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Detail acc = new Detail();
        acc.setAcc_no(123456789L); // Add 'L' to indicate a long literal
        acc.setName("hari");
        acc.setGmail("hariram2003@gmail.com");
        acc.setAmount(99999f);

        System.out.print(acc.getAcc_no() + " " + acc.getName() + " " + acc.getGmail() + " " + acc.getAmount());
    }
}
