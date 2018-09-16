fun y(s: bool) {
    fun x(b: num, c: num): num {
        var d: num := b + c;
        return if (d <= b) then c else b;
    }

    var p: num := 1;
    var l: num := 0;
    while (p >= 0) {
        l := p * 2;
        p := p / 2;
    }
}

fun z(x: num) {
    t();
    return y(true);
}

fun t() {
    return z(1);
}