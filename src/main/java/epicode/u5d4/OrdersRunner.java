package epicode.u5d4;

import epicode.u5d4.DAO.ItemService;
import epicode.u5d4.entities.*;
import epicode.u5d4.superclass.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class OrdersRunner implements CommandLineRunner {
    @Autowired
    ItemService itemService;


    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d4Application.class);
//        try {
//            Menu m = (Menu) ctx.getBean("menu");
//            m.printMenu();
//
//            Table t1 = (Table) ctx.getBean("Tavolo1");
//
//            Order o1 = new Order(4, t1);
//
//            o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
//            o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
//            o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
//            o1.addItem(ctx.getBean("lemonade", Drink.class));
//            o1.addItem(ctx.getBean("lemonade", Drink.class));
//            o1.addItem(ctx.getBean("wine", Drink.class));
//
//            System.out.println("DETTAGLI TAVOLO 1:");
//            o1.print();
//
//            System.out.println("CONTO TAVOLO 1");
//            System.out.println(o1.getTotal());
//        } catch (Exception ex) {
//            System.err.println(ex.getMessage());
//        } finally {
//            ctx.close();
//        }


        System.out.println("------SAVE IN DATABASE--------");

        itemService.saveItem((Item) ctx.getBean("toppings_tomato"));
        itemService.saveItem((Item) ctx.getBean("toppings_cheese"));
        itemService.saveItem((Item) ctx.getBean("toppings_ham"));
        itemService.saveItem((Item) ctx.getBean("toppings_pineapple"));
        itemService.saveItem((Item) ctx.getBean("toppings_salami"));
        itemService.saveItem((Item) ctx.getBean("pizza_margherita"));
        itemService.saveItem((Item) ctx.getBean("hawaiian_pizza"));
        itemService.saveItem((Item) ctx.getBean("salami_pizza"));
        itemService.saveItem((Item) ctx.getBean("salami_pizza_xl"));
        itemService.saveItem((Item) ctx.getBean("lemonade"));
        itemService.saveItem((Item) ctx.getBean("water"));
        itemService.saveItem((Item) ctx.getBean("wine"));


    }
}
