// Generated by view binder compiler. Do not edit!
package com.example.paint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.paint.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btBlue;

  @NonNull
  public final Button btGreen;

  @NonNull
  public final Button btTeal;

  @NonNull
  public final Button btYellow;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final ConstraintLayout rlVar1;

  @NonNull
  public final TextView tvVar1;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView, @NonNull Button btBlue,
      @NonNull Button btGreen, @NonNull Button btTeal, @NonNull Button btYellow,
      @NonNull Guideline guideline2, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout rlVar1,
      @NonNull TextView tvVar1) {
    this.rootView = rootView;
    this.btBlue = btBlue;
    this.btGreen = btGreen;
    this.btTeal = btTeal;
    this.btYellow = btYellow;
    this.guideline2 = guideline2;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.rlVar1 = rlVar1;
    this.tvVar1 = tvVar1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btBlue;
      Button btBlue = ViewBindings.findChildViewById(rootView, id);
      if (btBlue == null) {
        break missingId;
      }

      id = R.id.btGreen;
      Button btGreen = ViewBindings.findChildViewById(rootView, id);
      if (btGreen == null) {
        break missingId;
      }

      id = R.id.btTeal;
      Button btTeal = ViewBindings.findChildViewById(rootView, id);
      if (btTeal == null) {
        break missingId;
      }

      id = R.id.btYellow;
      Button btYellow = ViewBindings.findChildViewById(rootView, id);
      if (btYellow == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      ConstraintLayout rlVar1 = (ConstraintLayout) rootView;

      id = R.id.tvVar1;
      TextView tvVar1 = ViewBindings.findChildViewById(rootView, id);
      if (tvVar1 == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, btBlue, btGreen, btTeal,
          btYellow, guideline2, linearLayout, linearLayout2, rlVar1, tvVar1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}