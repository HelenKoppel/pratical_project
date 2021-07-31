package model;

import javax.persistence.*;

@Entity
public class OrderDetails {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int order_details_id;

        @Column(name = "amount")
        private float amount;

        @Column(name = "no_of_serving")
        private int no_of_serving;

        @Column(name = "total_amount")
        private float total_amount;


}
