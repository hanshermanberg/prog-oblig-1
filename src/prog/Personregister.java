package prog;

import java.util.ArrayList;

class Dato {
    int dag;
    int måned;
    int år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

}

class Person {
    String navn;
    int alder;
    Dato fødselsdato;
    String email;
    String tlfnr;
    public Person(String navn, int alder, Dato fødselsdato, String email, String tlfnr){
        this.navn=navn;
        this.alder=alder;
        this.fødselsdato=fødselsdato;
        this.email=email;
        this.tlfnr=tlfnr;
    }
}

public class Personregister {
    ArrayList<Person> personregister = new ArrayList<>();

    public void leggTil(Person person) throws InvalidAgeException, InvalidDateException {
        if (person.alder < 0 || person.alder > 120) {
            throw new InvalidAgeException("Ugyldig alder");
        }
        if (person.fødselsdato.dag < 1 || person.fødselsdato.dag > 31) {
            throw new InvalidDateException("Ugyldig dag i måned");
        }
        if (person.fødselsdato.måned < 1 || person.fødselsdato.måned > 12) {
            throw new InvalidDateException("Ugyldig måned");
        }
        if (person.fødselsdato.år < 1900 || person.fødselsdato.år > 2020) {
            throw new InvalidDateException("Denne personen lever ikke");
        }
        personregister.add(person);
    }

    public String toString() {
        String ut="";
        for (Person person : personregister) {
            ut += person.navn + " " + person.alder + " " + person.fødselsdato.dag + "." + person.fødselsdato.måned + "." + person.fødselsdato.år+"\n";
        }
        return ut;
    }
}





