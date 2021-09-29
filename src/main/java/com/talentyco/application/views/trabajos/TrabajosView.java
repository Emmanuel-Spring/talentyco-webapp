package com.talentyco.application.views.trabajos;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.talentyco.application.views.MainLayout;

@PageTitle("Trabajos")
@Route(value = "hello-world", layout = MainLayout.class)
public class TrabajosView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public TrabajosView() {
        addClassName("trabajos-view");
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }

}
