var styles=new Map();

/**
 * Fonction qui permet d'ajouter des 'option' à la liste déroulante de sélection de style
 */
function afficherStylesOptions(){
    let listeDeroulante = document.getElementById("choixStyle")

    styles.forEach((valeur, key) => {
       
        let baliseOption = document.createElement("option")
        baliseOption.setAttribute("value",key)
        baliseOption.innerText=key;

        listeDeroulante.appendChild(baliseOption)
    })

    }
 
/**
 * Fonction chargée de mettre à jour suivant le style sélectionné
 */
function majStyle(){
    //récup style sélectionné
    let style = document.getElementById("choixStyle").value
    var elementTxt = document.getElementById("txt");
    elementTxt.removeAttribute("class")
    var elementsImg = document.getElementsByTagName("img");
    for(let elementImg of elementsImg) {
        elementImg.removeAttribute("class") 
    }
    elementTxt.setAttribute("class",styles.get(style).fond +" "+ styles.get(style).txt)
    for(let elementImg of elementsImg) {
        elementImg.setAttribute("class",styles.get(style).img )
    }
}

/**
 * Fonction qui permet d'ajouter un nouveau style par rapport à notre sélection
 */
function ajouterStyle(){
    let nom = document.getElementById("nomStyle").value
    let txt = document.getElementById("txtStyle").value
    let fond = document.getElementById("fondStyle").value
    let img = document.getElementById("imgStyle").value

    styles.set(nom,{txt:txt,fond:fond,img:img})

console.log(styles)
    afficherStylesOptions();

}

function init(){
    styles.set("defaut",{txt:"txtBlue",fond:"fondRouge",img:"imgNB"})
    afficherStylesOptions();
}