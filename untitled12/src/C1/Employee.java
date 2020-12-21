package C1;

public class Employee {
    int id;
    String name;
    String city;
    int age;
    double comm;

    public Employee(int id, String name, String city, int age, double comm) {

        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (age != employee.age) return false;
        if (Double.compare(employee.comm, comm) != 0) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return city != null ? city.equals(employee.city) : employee.city == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(comm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", comm=" + comm +
                '}';
    }
}
