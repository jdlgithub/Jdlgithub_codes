# import os
# #Demander le nom
# def Demander_nom():
#     nom_saisie= input("Quel est votre nom ? ")   
#     while nom_saisie == "":
#         try:
#             nom_saisie = input("Quel est votre nom ? ")
#         except:
#             print("Vous devez saisir votre nom !")
#     return nom_saisie
# nom1 = Demander_nom()
# nom2 = Demander_nom()

#  #Demander l'age 
# def Demander_age(nom):
#     age_ini = 0
#     while age_ini == 0 :
#         try:
#             age_saisie=(input( nom + " Quel est votre age ? "))
#             age_ini = int (age_saisie)
#         except:
#             print("Vous devez rentrer un nombre idiot !")
#     return age_ini
# age1 = Demander_age(nom1)
# age2 = Demander_age(nom2)


# #Afficher resultats
# def Afficher_resultats(nom,age): 
#     print("Vous vous appeller " + nom + " et vous avez " + str(age) + " ans "\
#      "l'an prochain vous aurez " + str(age + 1) + " ans" + " felicitations !" )
#     if age == 1 or  age == 2 or age == 3:print("Vous etes bébé")
#     elif age < 10:print("Vous etes enfant")
#     elif age == 17:print("Vous etes presque majeur")
#     elif 12 <= age < 18:print("Vous etes adolescent")
#     elif age > 60:print("Vous etes senior")
#     elif age == 18:print("Tout juste majeur Felicitation !")
#     elif age <= 18:print("Vous etes mineur")
#     else:print("Vous etes majeur")
   
# Resultats1 = Afficher_resultats(nom1,age1)
# Resultats2 = Afficher_resultats(nom2,age2)

# for i in range (0, 4): print(i)

# os.system("pause")


# Methode de progarmmation orientée object 

#Definition de personne
class Etre_vivant():#Classe parent de Chat et Personne
    ESPECE_ETRE_VIVANT = "(Espece non identifié)"
    def Infos_etre_vivant(self):
        print("Espece : " + self.ESPECE_ETRE_VIVANT)

class Chat(Etre_vivant):# La classe chat herite de la classe Personne -Class perssonne est parent et -Chat est enfant
    ESPECE_ETRE_VIVANT = "Animal"
          
class Personne(Etre_vivant):#Classe enfant ou classe derivée de Etre_vivant
    ESPECE_ETRE_VIVANT = "Humain" #Variable de classe Variable globale pour la classe
    def __init__(self, nom:str = "", age:int = 0):# constructeur
        self.nom = nom #Declaration de variable d'instance nom 
        # self.age = input("Quel est votre age " + self.nom )
        if self.nom == "":
            self.Demander_nom()
        self.age = age #Declaration de la variable d'instance age
        print("Constructeur de " + self.nom)
    
    def Se_presenter(self):#Methode 1
        if self.age==0 : 
            print("Je m'appelle " + self.nom)
        else:
            print("Je m'appelle " + self.nom , "j'ai " + str(self.age) , "ans")
        # print("Est majeur :", self.Est_majeur())
            if self.Est_majeur():
                print("Je suis majeur")
            else:
                print("Je suis mineur")

    def Est_majeur(self):#Methode 2
        if self.age >= 18 :
            return True
        else: 
            return False
    def Demander_nom(self):#Methode 3 
        self.nom = input("Quel est votre nom ?")

class Etudiant(Personne):
    def __init__(self,nom: str,age: int, etudes: str ):
        super().__init__(nom,age)
        self.etudes = etudes

    def Se_presenter(self):# Surcharge de la Methode Se_presenter 
        super().Se_presenter()
        print("Je suis etudiant en " + self.etudes)
        

    
              
#Utilisation 
Liste_de_personne = [ Personne("Jdl",45), #Affiche les objets en liste
                      Personne("minec",13),
                    Personne("",9)]

chat = Chat() #Creation d'un objet chat
chat.Infos_etre_vivant()

etre_vivant = Etre_vivant() #Creatio d'un objet etre_vivant
etre_vivant.Infos_etre_vivant()

etudiant = Etudiant("Marc",20,"Informatique a polythec")
etudiant.Se_presenter()
etudiant.Infos_etre_vivant()

#Presentation
for personne in Liste_de_personne:
    personne.Se_presenter() #Methode d'instance 1
    personne.Infos_etre_vivant() # Methode de classe ou fonction statique 
                                #elle ne depend pas de l'instance et donc on peut l'appeler depuis\
                                #la classe et donc on peut retirer le self de la methode appellé             
 


# print("Nom de personne 1 est : " + personne1.nom)
# print("Nom de personne 2 est : " + personne2.nom)
# print("Est majeur :",personne1.Est_majeur())
# print("Est majeur :",personne2.Est_majeur())