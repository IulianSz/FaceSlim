package org.indywidualni.fblite;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

public class MessagesShortcutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent();
        Intent launchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/messages"));
        intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, launchIntent);
        intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, getString(R.string.messages));
        Parcelable iconResource = Intent.ShortcutIconResource.fromContext(this, R.drawable.ic_launcher);
        intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconResource);
        setResult(RESULT_OK, intent);

        finish();
    }

}