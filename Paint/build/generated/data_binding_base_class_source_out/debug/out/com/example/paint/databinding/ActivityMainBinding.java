// Generated by view binder compiler. Do not edit!
package com.example.paint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.paint.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Override;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final FloatingActionButton paletteBtn;

  private ActivityMainBinding(@NonNull LinearLayout rootView,
      @Nullable FloatingActionButton paletteBtn) {
    this.rootView = rootView;
    this.paletteBtn = paletteBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    FloatingActionButton paletteBtn = ViewBindings.findChildViewById(rootView, R.id.paletteBtn);

    return new ActivityMainBinding((LinearLayout) rootView, paletteBtn);
  }
}
