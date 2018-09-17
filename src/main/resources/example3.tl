fun a(x: num, y: num, z: num) {
    a(x, y, z);
}

fun a(x: num, y: num) {
    a(x, y, 0);
}

fun a(x: num) {
    a(x, 1);
}

fun a() {
    a(2);
}