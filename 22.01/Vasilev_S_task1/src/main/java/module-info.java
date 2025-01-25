module ru.vasilev_semen.vasilev_s_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev_semen.vasilev_s_task1 to javafx.fxml;
    exports ru.vasilev_semen.vasilev_s_task1;
}