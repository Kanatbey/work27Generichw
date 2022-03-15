package com.company;

public class Main {

    public static void main(String[] args) {
        Box a1 =new Box(23);
        Box a2 =new Box<>("Aisha");
        Box a3 =new Box<>(Math.PI);
        Box a4 =new Box<>('?');
        Box a5 =new Box<>(false);

        Box.generic(a1);
        Box.generic(a2);
        Box.generic(a3);
        Box.generic(a4);
        Box.generic(a5);
    }
}
