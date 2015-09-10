package org.maesi.fx.examples.controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class TextSplitterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textarea;

    @FXML
    private ListView<String> list;
    
    @FXML
    void initialize() {
        assert textarea != null : "fx:id=\"textarea\" was not injected: check your FXML file 'gui.fxml'.";
        assert list != null : "fx:id=\"list\" was not injected: check your FXML file 'gui.fxml'.";

        textarea.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable,
					String oldValue, String newValue) {
		        list.setItems(FXCollections.observableArrayList(newValue.split(" ")));
			}
		});
    }
}
