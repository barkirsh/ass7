public class Parser {
    String suchAsPat = "<np>.*</np> (,)? such as (<np>.*</np>( , <np>.*</np>)* (,)?(and|or|,) <np>.*</np>|(,<np>.*</np>))";
    String suchNpAsPat = "such <np>.*</np> as (<np>.*</np>( , <np>.*</np>)* (,)?(and|or|,) <np>.*</np>|(,<np>.*</np>))";
    String including = "<np>.*</np> (,)? including (<np>.*</np>( , <np>.*</np>)* (,)?(and|or|,) <np>.*</np>|(,<np>.*</np>))";
    String especially = "<np>.*</np> (,)? including (<np>.*</np>( , <np>.*</np>)* (,)?(and|or|,) <np>.*</np>|(,<np>.*</np>))";
    String whichIs = "<np>.*</np> (,)? which is ((an example|a kind|a class) of)? <np>.*</np>";

//NP {,} including NP {, NP, ..., {and|or} NP}
//NP {,} especially NP {, NP, ..., {and|or} NP}
// NP {,} which is {{an example|a kind|a class} of} NP
}
