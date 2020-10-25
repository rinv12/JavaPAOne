package application;

import server.*;

public class Controller {
    Client client;

    public Controller(){
        client = new Client();
        client.connect();
    }
}
