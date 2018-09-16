fun y(s: bool) {
    fun x(b: num, c: num): num {
        var d: num := b + c;
        return if (d <= b) then c else b;
    }

    var p: num := 1;
    var l: num := 0;

    fun y(s: num): num {
        var p: num := 2 * s;
        return if (p >= 2) then p else s;
    }

    while (p >= 0) {
        l := p * 2;
        p := p / x(p, y(l));
    }
}

var p: bool := true;

fun z(p: unit) {
    z(t());
}

fun z(x: num) {
    t();
    return y(true);
}

fun t() {
    var x := u(1);

    fun u(i: num) { z(u(i)); }

    return x;
}

fun plus(x: num, y: num): num {
    return x + y;
}

fun plus(x: bool, y: bool): bool {
    return x || y;
}

fun branch() {
    var z: num := plus(3, plus(1, 2));
    if (z >= 5) then {
        t();
    } else {
        y(plus(z < 3, z < 2));
    }
}