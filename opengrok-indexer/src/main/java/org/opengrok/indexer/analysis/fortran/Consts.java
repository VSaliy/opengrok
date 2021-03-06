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
 * Copyright (c) 2009, 2021, Oracle and/or its affiliates. All rights reserved.
 */
package org.opengrok.indexer.analysis.fortran;

import java.util.HashSet;
import java.util.Set;

/**
 * Holds static hash set containing the Fortran keywords.
 * The list is based upon the draft available from http://j3-fortran.org/
 */
public class Consts {

    static final Set<String> kwd = new HashSet<>();

    static {
        // multi-word keywords, such as "DOUBLE PRECISION", etc. are for
        // documentation only (?impossible to have LALR(1) parser for
        // fortran?)
        kwd.add("abort");
        kwd.add("abs");
        kwd.add("access");
        kwd.add("achar");
        kwd.add("acos");
        kwd.add("acosh");
        kwd.add("addop");
        kwd.add("adjustl");
        kwd.add("adjustr");
        kwd.add("aimag");
        kwd.add("aint");
        kwd.add("alarm");
        kwd.add("all");
        kwd.add("allocatable");
        kwd.add("allocate");
        kwd.add("allocated");
        kwd.add("and");
        kwd.add("anint");
        kwd.add("any");
        kwd.add("asin");
        kwd.add("asinh");
        kwd.add("associated");
        kwd.add("atan");
        kwd.add("atan2");
        kwd.add("atanh");
        kwd.add("backspace");
        kwd.add("besj0");
        kwd.add("besj1");
        kwd.add("besjn");
        kwd.add("besy0");
        kwd.add("besy1");
        kwd.add("besyn");
        kwd.add("bit_size");
        kwd.add("block");
        kwd.add("break");
        kwd.add("btest");
        kwd.add("byte");
        kwd.add("c_associated");
        kwd.add("c_f_pointer");
        kwd.add("c_f_procpointer");
        kwd.add("c_funloc");
        kwd.add("c_loc");
        kwd.add("call");
        kwd.add("case");
        kwd.add("ceiling");
        kwd.add("char");
        kwd.add("character");
        kwd.add("chdir");
        kwd.add("chmod");
        kwd.add("close");
        kwd.add("cmplx");
        kwd.add("command_argument_count");
        kwd.add("common");
        kwd.add("complex");
        kwd.add("conjg");
        kwd.add("continue");
        kwd.add("cos");
        kwd.add("cosh");
        kwd.add("count");
        kwd.add("cpu_time");
        kwd.add("cshift");
        kwd.add("ctime");
        kwd.add("cycle");
        kwd.add("data");
        kwd.add("date_and_time");
        kwd.add("dble");
        kwd.add("dcmplx");
        kwd.add("deallocate");
        kwd.add("dfloat");
        kwd.add("digits");
        kwd.add("dim");
        kwd.add("dimension");
        kwd.add("do");
        kwd.add("dot_product");
        kwd.add("double");
        kwd.add("dprod");
        kwd.add("dreal");
        kwd.add("dtime");
        kwd.add("elemental");
        kwd.add("else");
        kwd.add("elseif");
        kwd.add("end");
        kwd.add("enddo");
        kwd.add("endfile");
        kwd.add("endif");
        kwd.add("eol");
        kwd.add("eoshift");
        kwd.add("epsilon");
        kwd.add("eq");
        kwd.add("equivalence");
        kwd.add("erf");
        kwd.add("erfc");
        kwd.add("etime");
        kwd.add("exit");
        kwd.add("exp");
        kwd.add("exponent");
        kwd.add("external");
        kwd.add("false");
        kwd.add("fdate");
        kwd.add("fget");
        kwd.add("fgetc");
        kwd.add("float");
        kwd.add("floor");
        kwd.add("flush");
        kwd.add("fnum");
        kwd.add("format");
        kwd.add("fput");
        kwd.add("fputc");
        kwd.add("fraction");
        kwd.add("free");
        kwd.add("frequency");
        kwd.add("fseek");
        kwd.add("fstat");
        kwd.add("ftell");
        kwd.add("function");
        kwd.add("gamma");
        kwd.add("ge");
        kwd.add("gerror");
        kwd.add("get_command");
        kwd.add("get_command_argument");
        kwd.add("get_environment_variable");
        kwd.add("getarg");
        kwd.add("getcwd");
        kwd.add("getenv");
        kwd.add("getgid");
        kwd.add("getlog");
        kwd.add("getpid");
        kwd.add("getuid");
        kwd.add("gmtime");
        kwd.add("goto");
        kwd.add("gt");
        kwd.add("hostnm");
        kwd.add("huge");
        kwd.add("iachar");
        kwd.add("iand");
        kwd.add("iargc");
        kwd.add("ibclr");
        kwd.add("ibits");
        kwd.add("ibset");
        kwd.add("ichar");
        kwd.add("idate");
        kwd.add("identifier");
        kwd.add("ieor");
        kwd.add("ierrno");
        kwd.add("if");
        kwd.add("implicit");
        kwd.add("include");
        kwd.add("index");
        kwd.add("inquire");
        kwd.add("int");
        kwd.add("int2");
        kwd.add("int8");
        kwd.add("integer");
        kwd.add("ior");
        kwd.add("irand");
        kwd.add("is_iostat_end");
        kwd.add("is_iostat_eor");
        kwd.add("isatty");
        kwd.add("ishft");
        kwd.add("ishftc");
        kwd.add("isnan");
        kwd.add("itime");
        kwd.add("kill");
        kwd.add("kind");
        kwd.add("lbound");
        kwd.add("le");
        kwd.add("len");
        kwd.add("len_trim");
        kwd.add("lgamma");
        kwd.add("lge");
        kwd.add("lgt");
        kwd.add("link");
        kwd.add("lle");
        kwd.add("llt");
        kwd.add("lnblnk");
        kwd.add("loc");
        kwd.add("log");
        kwd.add("log10");
        kwd.add("logical");
        kwd.add("long");
        kwd.add("lshift");
        kwd.add("lstat");
        kwd.add("lt");
        kwd.add("ltime");
        kwd.add("malloc");
        kwd.add("matmul");
        kwd.add("max");
        kwd.add("maxexponent");
        kwd.add("maxloc");
        kwd.add("maxval");
        kwd.add("mclock");
        kwd.add("mclock8");
        kwd.add("merge");
        kwd.add("min");
        kwd.add("minexponent");
        kwd.add("minloc");
        kwd.add("minval");
        kwd.add("mod");
        kwd.add("modulo");
        kwd.add("move_alloc");
        kwd.add("mulop");
        kwd.add("mvbits");
        kwd.add("ne");
        kwd.add("nearest");
        kwd.add("new_line");
        kwd.add("nint");
        kwd.add("none");
        kwd.add("not");
        kwd.add("null");
        kwd.add("nullify");
        kwd.add("open");
        kwd.add("or");
        kwd.add("pack");
        kwd.add("parameter");
        kwd.add("perror");
        kwd.add("pointer");
        kwd.add("precision");
        kwd.add("present");
        kwd.add("print");
        kwd.add("product");
        kwd.add("program");
        kwd.add("punch");
        kwd.add("pure");
        kwd.add("qstring");
        kwd.add("radix");
        kwd.add("ran");
        kwd.add("rand");
        kwd.add("random_number");
        kwd.add("random_seed");
        kwd.add("range");
        kwd.add("read");
        kwd.add("real");
        kwd.add("relop");
        kwd.add("rename");
        kwd.add("repeat");
        kwd.add("reshape");
        kwd.add("return");
        kwd.add("rewind");
        kwd.add("rrspacing");
        kwd.add("rshift");
        kwd.add("save");
        kwd.add("scale");
        kwd.add("scan");
        kwd.add("secnds");
        kwd.add("second");
        kwd.add("select");
        kwd.add("selected_int_kind");
        kwd.add("selected_real_kind");
        kwd.add("set_exponent");
        kwd.add("shape");
        kwd.add("sign");
        kwd.add("signal");
        kwd.add("sin");
        kwd.add("sinh");
        kwd.add("size");
        kwd.add("sizeof");
        kwd.add("sleep");
        kwd.add("sngl");
        kwd.add("spacing");
        kwd.add("spread");
        kwd.add("sqrt");
        kwd.add("srand");
        kwd.add("stat");
        kwd.add("stop");
        kwd.add("subroutine");
        kwd.add("sum");
        kwd.add("symlnk");
        kwd.add("system");
        kwd.add("system_clock");
        kwd.add("tan");
        kwd.add("tanh");
        kwd.add("then");
        kwd.add("time");
        kwd.add("time8");
        kwd.add("tiny");
        kwd.add("transfer");
        kwd.add("transpose");
        kwd.add("trim");
        kwd.add("true");
        kwd.add("ttynam");
        kwd.add("ubound");
        kwd.add("umask");
        kwd.add("unary");
        kwd.add("unlink");
        kwd.add("unpack");
        kwd.add("verify");
        kwd.add("volatile");
        kwd.add("where");
        kwd.add("while");
        kwd.add("write");
        kwd.add("xor");
    }

    private Consts() {
    }

}
