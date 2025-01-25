package nexusglobal.wordprocessor.ui.components;

import com.vaadin.flow.component.button.Button;
import nexusglobal.wordprocessor.utils.ButtonUtils;


public class CloseableDialog extends HeaderDialog {

    public CloseableDialog() {
        super();
        setupCloseButton();
    }


    protected void setupCloseButton() {
        Button closeButton = ButtonUtils.createCloseButton();
        closeButton.addClickListener(event -> close());

        this.headerHLayout.add(closeButton);
    }

}