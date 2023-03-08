var animaux = ["alligator","baleine","buffle","cheval","chimpanze","elephant","lion"]

function creationBoutons(){
 //pour chaque animal, créer un bouton 
for (let i = 0; i < animaux.length; i++) {
const animal = animaux[i];
//création bouton
var bouton = document.createElement("button");
var txBt = document.createTextNode(animal);
bouton.appendChild(txBt)
//ajout un attibut de onclick
let att = document.createAttribute("onclick")
att.value="changerAnimal('"+animal+"')"
bouton.setAttributeNode(att)

var parent = document.getElementById("lesAnimaux")
parent.appendChild(bouton);
}
}
function changerAnimal(animal){
    // mettre à jour la source de la photo et du player
    //changer image
document.getElementById("photo").setAttribute("src","photos/"+animal+".jpeg")
    //changer son
    document.getElementById("player").setAttribute("src","cris/"+animal+".mp3")
}
