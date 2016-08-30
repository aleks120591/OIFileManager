package org.android.filemanager.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;

import org.android.filemanager.R;

public abstract class InputDialog extends Builder {

    private final EditText editText;

    public abstract void onActionClick(String text);

    public InputDialog(Context context, String positive, String title) {
        super(context);
        View view = View.inflate(context, R.layout.dialog_edit_text, null);
        editText = (EditText) view.findViewById(R.id.dialog_edit_text);
        setView(view);
        setNegativeButton("Cancel", null);
        setPositiveButton(positive, new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (editText.length() != 0)
                    onActionClick(editText.getText().toString());
            }
        });

        setTitle(title);
    }

    public void setDefault(String text) {
        editText.setText(text);
        editText.setSelection(editText.getText().length());
    }
}
