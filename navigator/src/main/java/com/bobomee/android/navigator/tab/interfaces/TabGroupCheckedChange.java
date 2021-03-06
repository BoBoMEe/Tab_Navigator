/*
 * Copyright (C) 2017.  BoBoMEe(wbwjx115@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.bobomee.android.navigator.tab.interfaces;

import com.bobomee.android.navigator.listener.ListenerImpl;
import java.util.List;

/**
 * Created on 2017/1/22.下午2:47.
 *
 * @author bobomee.
 */

public class TabGroupCheckedChange extends ListenerImpl<OnTabGroupCheckedChangeListener> {

  public void onCheckedChange(ITabGroup group, int position) {
    List<OnTabGroupCheckedChangeListener> from = from();
    if (from != null && !from.isEmpty()) {
      for (OnTabGroupCheckedChangeListener lOnTabGroupCheckedChangeListener : from) {
        if (null != lOnTabGroupCheckedChangeListener) {
          lOnTabGroupCheckedChangeListener.onCheckedChange(group, position);
        }
      }
    }
  }

  public void clearOnTabGroupCheckedChangeListener() {
    List<OnTabGroupCheckedChangeListener> from = from();
    from.clear();
  }
}
