// Pascal
// output: "ooo 5m"

program OOO;
type
    alphabet = array[0..25] of char;
var
    a: alphabet;
    c: byte;
begin
    for c:= 0 to 26 do
        a[c] := chr(c + 97);
    for c:= 0 to 2 do
        write(a[14]);
    write(' ');
    write(chr(53));
    write(a[12]);
    writeln();
    readln;
end.
