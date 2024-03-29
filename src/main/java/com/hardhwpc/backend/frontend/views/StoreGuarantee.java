package com.hardhwpc.backend.frontend.views;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the store-guarantee template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("store-guarantee")
@JsModule("./src/views/store-guarantee.js")
public class StoreGuarantee extends PolymerTemplate<StoreGuarantee.StoreGuaranteeModel> {

    /**
     * Creates a new StoreGuarantee.
     */
    public StoreGuarantee() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between StoreGuarantee and store-guarantee
     */
    public interface StoreGuaranteeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
