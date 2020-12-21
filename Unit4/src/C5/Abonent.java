package C5;

public class Abonent {
    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber;

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public class PhoneNumber {
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            this.netCode = netCode;
        }

        public int generateNumber() {
            int temp = new java.util.Random().nextInt(10_000_000);
            number = temp;
            return number;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-" + phoneNumber.netCode + "-" + phoneNumber);
        } else {
            return ("phone number is empty");
        }
    }

    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(100);
        s.append("Abonent '" + name + "':\n");
        s.append(" ID - " + id + "\n");
        s.append(" Tariff Plan - " + tariffPlan + "\n");
        s.append(" Phone Number - " + getPhoneNumber() + "\n");

        return s.toString();
    }
}
