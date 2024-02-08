package epicode.u5d4.entities;

import epicode.u5d4.superclass.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@DiscriminatorValue("topping")
@NoArgsConstructor
public class Topping extends Item {
    private String name;

    @ManyToMany
    @JoinTable(name = "topping-pizza", joinColumns = @JoinColumn(name = "topping_id"), inverseJoinColumns = @JoinColumn(name = "pizza_id"))
    private List<Pizza> pizzas;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
