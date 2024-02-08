package epicode.u5d4.entities;

import epicode.u5d4.superclass.Item;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("drink")
@NoArgsConstructor
public class Drink extends Item {
    String name;


    public Drink( String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
