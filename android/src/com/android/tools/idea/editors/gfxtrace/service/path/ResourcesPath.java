/*
 * Copyright (C) 2015 The Android Open Source Project
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
 *
 * THIS FILE WAS GENERATED BY codergen. EDIT WITH CARE.
 */
package com.android.tools.idea.editors.gfxtrace.service.path;

import com.android.tools.rpclib.schema.*;
import org.jetbrains.annotations.NotNull;

import com.android.tools.rpclib.binary.BinaryClass;
import com.android.tools.rpclib.binary.BinaryID;
import com.android.tools.rpclib.binary.BinaryObject;
import com.android.tools.rpclib.binary.Decoder;
import com.android.tools.rpclib.binary.Encoder;
import com.android.tools.rpclib.binary.Namespace;

import java.io.IOException;

public final class ResourcesPath extends Path {
  @Override
  public StringBuilder stringPath(StringBuilder builder) {
    return myCapture.stringPath(builder).append(".Resources");
  }

  @Override
  public Path getParent() {
    return myCapture;
  }

  //<<<Start:Java.ClassBody:1>>>
  private CapturePath myCapture;

  // Constructs a default-initialized {@link ResourcesPath}.
  public ResourcesPath() {}


  public CapturePath getCapture() {
    return myCapture;
  }

  public ResourcesPath setCapture(CapturePath v) {
    myCapture = v;
    return this;
  }

  @Override @NotNull
  public BinaryClass klass() { return Klass.INSTANCE; }


  private static final Entity ENTITY = new Entity("path","Resources","","");

  static {
    ENTITY.setFields(new Field[]{
      new Field("Capture", new Pointer(new Struct(CapturePath.Klass.INSTANCE.entity()))),
    });
    Namespace.register(Klass.INSTANCE);
  }
  public static void register() {}
  //<<<End:Java.ClassBody:1>>>
  public enum Klass implements BinaryClass {
    //<<<Start:Java.KlassBody:2>>>
    INSTANCE;

    @Override @NotNull
    public Entity entity() { return ENTITY; }

    @Override @NotNull
    public BinaryObject create() { return new ResourcesPath(); }

    @Override
    public void encode(@NotNull Encoder e, BinaryObject obj) throws IOException {
      ResourcesPath o = (ResourcesPath)obj;
      e.object(o.myCapture);
    }

    @Override
    public void decode(@NotNull Decoder d, BinaryObject obj) throws IOException {
      ResourcesPath o = (ResourcesPath)obj;
      o.myCapture = (CapturePath)d.object();
    }
    //<<<End:Java.KlassBody:2>>>
  }
}
