module ru.vasilev_semen.vasilev_s_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev_semen.vasilev_s_task2 to javafx.fxml;
    exports ru.vasilev_semen.vasilev_s_task2;
}