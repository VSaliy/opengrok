/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2010, 2021, Oracle and/or its affiliates. All rights reserved.
 * Portions Copyright (c) 2017, Chris Fraire <cfraire@me.com>.
 */
package org.opengrok.indexer.analysis.perl;

import java.util.HashSet;
import java.util.Set;

/**
 * Holds static hash set containing the Perl keywords.
 */
public class Consts {

    static final Set<String> kwd = new HashSet<>();
    static {
        // Note that keywords with 1 letter will be ignored for historical
        // reasons, as the {Identifier} used to require 2 characters in
        // PerlXref while only 1 in PerlSymbolTokenizer.
        kwd.add("__DATA__");
        kwd.add("__END__");
        kwd.add("__FILE__");
        kwd.add("__LINE__");
        kwd.add("__PACKAGE__");
        kwd.add("__SUB__");
        kwd.add("abs");
        kwd.add("accept");
        kwd.add("alarm");
        kwd.add("and");
        kwd.add("atan2");
        kwd.add("attributes");
        kwd.add("autodie");
        kwd.add("AUTOLOAD");
        kwd.add("autouse");
        kwd.add("base");
        kwd.add("BEGIN");
        kwd.add("bigint");
        kwd.add("bignum");
        kwd.add("bigrat");
        kwd.add("bind");
        kwd.add("binmode");
        kwd.add("bless");
        kwd.add("blib");
        kwd.add("break");
        kwd.add("byte");
        kwd.add("bytes");
        kwd.add("caller");
        kwd.add("carp");
        kwd.add("charnames");
        kwd.add("chdir");
        kwd.add("CHECK");
        kwd.add("chmod");
        kwd.add("chomp");
        kwd.add("chop");
        kwd.add("chown");
        kwd.add("chr");
        kwd.add("chroot");
        kwd.add("close");
        kwd.add("closedir");
        kwd.add("cmp");
        kwd.add("confess");
        kwd.add("connect");
        kwd.add("constant");
        kwd.add("continue");
        kwd.add("CORE");
        kwd.add("cos");
        kwd.add("croak");
        kwd.add("crypt");
        kwd.add("dbmclose");
        kwd.add("dbmopen");
        kwd.add("default");
        kwd.add("defined");
        kwd.add("delete");
        kwd.add("DESTROY");
        kwd.add("diagnostics");
        kwd.add("die");
        kwd.add("do");
        kwd.add("dump");
        kwd.add("each");
        kwd.add("else");
        kwd.add("elseif"); /* parsed "but only to warn you ..." */
        kwd.add("elsif");
        kwd.add("encoding");
        kwd.add("END");
        kwd.add("endgrent");
        kwd.add("endhostent");
        kwd.add("endnetent");
        kwd.add("endprotoent");
        kwd.add("endpwent");
        kwd.add("endservent");
        kwd.add("eof");
        kwd.add("eq");
        kwd.add("err");
        kwd.add("eval");
        kwd.add("evalbytes");
        kwd.add("exec");
        kwd.add("exists");
        kwd.add("exit");
        kwd.add("exp");
        kwd.add("fc");
        kwd.add("fcntl");
        kwd.add("feature");
        kwd.add("fields");
        kwd.add("fileno");
        kwd.add("filetest");
        kwd.add("flock");
        kwd.add("for");
        kwd.add("foreach");
        kwd.add("fork");
        kwd.add("format");
        kwd.add("formline");
        kwd.add("ge");
        kwd.add("getc");
        kwd.add("getgrent");
        kwd.add("getgrgid");
        kwd.add("getgrnam");
        kwd.add("gethostbyaddr");
        kwd.add("gethostbyname");
        kwd.add("gethostent");
        kwd.add("getlogin");
        kwd.add("getnetbyaddr");
        kwd.add("getnetbyname");
        kwd.add("getnetent");
        kwd.add("getpeername");
        kwd.add("getpgrp");
        kwd.add("getppid");
        kwd.add("getpriority");
        kwd.add("getprotobyname");
        kwd.add("getprotobynumber");
        kwd.add("getprotoent");
        kwd.add("getpwent");
        kwd.add("getpwnam");
        kwd.add("getpwuid");
        kwd.add("getservbyname");
        kwd.add("getservbyport");
        kwd.add("getservent");
        kwd.add("getsockname");
        kwd.add("getsockopt");
        kwd.add("given"); //Perl 5.10
        kwd.add("glob");
        kwd.add("gmtime");
        kwd.add("goto");
        kwd.add("grep");
        kwd.add("gt");
        kwd.add("hex");
        kwd.add("if");
        kwd.add("import");
        kwd.add("index");
        kwd.add("INIT");
        kwd.add("int");
        kwd.add("integer");
        kwd.add("ioctl");
        kwd.add("join");
        kwd.add("keys");
        kwd.add("kill");
        kwd.add("last");
        kwd.add("lc");
        kwd.add("lcfirst");
        kwd.add("le");
        kwd.add("length");
        kwd.add("less");
        kwd.add("lib");
        kwd.add("link");
        kwd.add("listen");
        kwd.add("local");
        kwd.add("locale");
        kwd.add("localtime");
        kwd.add("lock");
        kwd.add("log");
        kwd.add("lstat");
        kwd.add("lt");
        kwd.add("m");
        kwd.add("map");
        kwd.add("mkdir");
        kwd.add("mro");
        kwd.add("msgctl");
        kwd.add("msgget");
        kwd.add("msgrcv");
        kwd.add("msgsnd");
        kwd.add("my");
        kwd.add("ne");
        kwd.add("new");
        kwd.add("next");
        kwd.add("no");
        kwd.add("not");
        kwd.add("oct");
        kwd.add("open");
        kwd.add("opendir");
        kwd.add("ops");
        kwd.add("or");
        kwd.add("ord");
        kwd.add("our");
        kwd.add("overload");
        kwd.add("overloading");
        kwd.add("pack");
        kwd.add("package");
        kwd.add("parent");
        kwd.add("pipe");
        kwd.add("pop");
        kwd.add("pos");
        kwd.add("print");
        kwd.add("printf");
        kwd.add("prototype");
        kwd.add("push");
        kwd.add("q");
        kwd.add("qq");
        kwd.add("qr");
        kwd.add("quotemeta");
        kwd.add("qw");
        kwd.add("qx");
        kwd.add("rand");
        kwd.add("re");
        kwd.add("read");
        kwd.add("readdir");
        kwd.add("readline");
        kwd.add("readlink");
        kwd.add("readpipe");
        kwd.add("recv");
        kwd.add("redo");
        kwd.add("ref");
        kwd.add("rename");
        kwd.add("require");
        kwd.add("reset");
        kwd.add("return");
        kwd.add("reverse");
        kwd.add("rewinddir");
        kwd.add("rindex");
        kwd.add("rmdir");
        kwd.add("s");
        kwd.add("say");
        kwd.add("scalar");
        kwd.add("seek");
        kwd.add("seekdir");
        kwd.add("select");
        kwd.add("semctl");
        kwd.add("semget");
        kwd.add("semop");
        kwd.add("send");
        kwd.add("setgrent");
        kwd.add("sethostent");
        kwd.add("setnetent");
        kwd.add("setpgrp");
        kwd.add("setpriority");
        kwd.add("setprotoent");
        kwd.add("setpwent");
        kwd.add("setservent");
        kwd.add("setsockopt");
        kwd.add("shift");
        kwd.add("shmctl");
        kwd.add("shmget");
        kwd.add("shmread");
        kwd.add("shmwrite");
        kwd.add("shutdown");
        kwd.add("sigtrap");
        kwd.add("sin");
        kwd.add("sleep");
        kwd.add("socket");
        kwd.add("socketpair");
        kwd.add("sort");
        kwd.add("splice");
        kwd.add("split");
        kwd.add("sprintf");
        kwd.add("sqrt");
        kwd.add("srand");
        kwd.add("stat");
        kwd.add("state");
        kwd.add("strict");
        kwd.add("study");
        kwd.add("sub");
        kwd.add("subs");
        kwd.add("substr");
        kwd.add("switch");
        kwd.add("symlink");
        kwd.add("syscall");
        kwd.add("sysopen");
        kwd.add("sysread");
        kwd.add("sysseek");
        kwd.add("system");
        kwd.add("syswrite");
        kwd.add("tell");
        kwd.add("telldir");
        kwd.add("threads::shared");
        kwd.add("threads");
        kwd.add("tie");
        kwd.add("tied");
        kwd.add("time");
        kwd.add("times");
        kwd.add("tr");
        kwd.add("truncate");
        kwd.add("uc");
        kwd.add("ucfirst");
        kwd.add("umask");
        kwd.add("undef");
        kwd.add("UNITCHECK");
        kwd.add("unless");
        kwd.add("unlink");
        kwd.add("unpack");
        kwd.add("unshift");
        kwd.add("untie");
        kwd.add("until");
        kwd.add("use");
        kwd.add("utf8");
        kwd.add("utime");
        kwd.add("values");
        kwd.add("vars");
        kwd.add("vec");
        kwd.add("vmsish");
        kwd.add("wait");
        kwd.add("waitpid");
        kwd.add("wantarray");
        kwd.add("warn");
        kwd.add("warnings::register");
        kwd.add("warnings");
        kwd.add("when");
        kwd.add("while");
        kwd.add("write");
        kwd.add("x");
        kwd.add("xor");
        kwd.add("y");
    }

    private Consts() {
    }

}
