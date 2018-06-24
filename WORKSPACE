# Copyright (C) 2017 The Dagger Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

http_archive(
    name = "google_bazel_common",
    strip_prefix = "bazel-common-aafb9b64f25f66b5ab6b9b991331160ef4130626",
    urls = ["https://github.com/google/bazel-common/archive/aafb9b64f25f66b5ab6b9b991331160ef4130626.zip"],
)

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()

maven_jar(
    name = "me_eugeniomarletti_kotlin_metadata_kotlin_metadata",
    artifact = "me.eugeniomarletti.kotlin.metadata:kotlin-metadata:1.4.0",
#    sha1 = "e6de126575ad6ca10b093129b7c30d000c9b0c37",
)

maven_jar(
    name = "me_eugeniomarletti_kotlin_metadata_kotlin_compiler_lite",
    artifact = "me.eugeniomarletti.kotlin.metadata:kotlin-compiler-lite:1.0.3-k-1.2.40",
#    sha1 = "bb16d1389968ad22c12243ae0bb6fcb3602f581a",
)

maven_jar(
    name = "org_jetbrains_kotlin_kotlin_stdlib",
    artifact = "org.jetbrains.kotlin:kotlin-stdlib:1.2.40",
#    sha1 = "3a2fc547f349ed6389262eabc2b1d05844242064",
)

maven_jar(
    name = "org_jetbrains_annotations",
    artifact = "org.jetbrains:annotations:13.0",
#    sha1 = "TODO",
)
