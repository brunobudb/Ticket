module asigment52e.tickets {
    requires javafx.controls;
    requires javafx.fxml;

    exports asigment52e.tickets.gui.controlers to javafx.fxml;
    exports asigment52e.tickets;
        opens asigment52e.tickets.gui.controlers to javafx.fxml;
        }
