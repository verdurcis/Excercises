package TaxiServiceWithValidations;

public class Driver {
    private String name;
    private String surname;
    private String id;


    public Driver(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }



    @Override
    public String toString() {
        return (STR."\n\t Driver's name: \{this.name} \n\t Driver's surname: \{this.surname} \n\t Driver's id: \{this.id}");
    }
}
