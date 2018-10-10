/*
 * Copyright 2018 cxx
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cc.colorcat.kingfisher.parser.gson;

import com.google.gson.Gson;

import java.lang.reflect.Type;

import cc.colorcat.kingfisher.core.ParserFactory;
import cc.colorcat.netbird.Parser;

/**
 * Author: cxx
 * Date: 2018-10-09
 * GitHub: https://github.com/ccolorcat
 */
public final class GsonParserFactory<T> implements ParserFactory<T> {
    private final Gson gson;

    public GsonParserFactory(Gson gson) {
        this.gson = gson;
    }

    @Override
    public Parser<? extends T> newParser(Type typeOfT) {
        return new GsonParser<>(gson, typeOfT);
    }
}
