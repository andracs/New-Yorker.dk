package model;

public class Door {

    String type;
    int fields;
    double height;
    double width;
    String handleType;
    int totalPrice;
    int coordinateX;
    int coordinateY;


    HandleType ht1 = new HandleType("Messing langgreb 1 side", 500);

    HandleType ht2 = new HandleType("Messing langgreb 2 sider", 1000);

    HandleType ht3 = new HandleType("Sort langgreb 1 side", 250);

    HandleType ht4 = new HandleType("Sort langgreb 2 sider", 500);

}
