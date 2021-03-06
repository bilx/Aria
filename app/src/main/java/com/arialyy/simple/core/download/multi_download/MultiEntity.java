/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.simple.core.download.multi_download;

import com.arialyy.aria.core.download.DownloadEntity;
import com.arialyy.aria.core.download.DownloadGroupEntity;

/**
 * Created by lyy on 2017/7/14.
 */
public class MultiEntity {
  public static final int SIMPLE_DOWNLOAD = 0xa1;
  public static final int GROUP_DOWNLOAD = 0xa2;

  DownloadEntity simpleEntity;
  DownloadGroupEntity groupEntity;
  String key;

  int type = -1;
}
