package com.hardhwpc.backend.frontend.views;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the cart-row template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("cart-row")
@JsModule("./src/views/cart-row.js")
public class CartRow extends PolymerTemplate<CartRow.CartRowModel> {

    /**
     * Creates a new CartRow.
     */
    public CartRow() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between CartRow and cart-row
     */
    public interface CartRowModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
