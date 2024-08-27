# Les fonctions

#nombre de lettre d'une chaine de caractère avec len()
# nom= input('Quel est votre nom ? ')
# age = input('Quel age avez vous ? ')
# print("Vous etes " + nom + "et vous avez " + str(age) + " ans.")
# print("Votre nom a " , len(nom) , "lettres.")

#Definition d'une fonction

# def est_majeur(age):
#     if age>= 18 : 
#         print("Est majeur")
#         return True
#     return False

# def afficher_infos(nom = "",age = 0):
#     if nom == "":
#         print("Vous n'avez pas entrer de nom.")
#         return #Sortie forcée de la fonction
    
#     if age == 0:
#         print("Vous etes " + nom)   
#     else:  
#         print("Vous etes " + nom + " et vous avez " + str(age) + " ans.")
#     print("Votre nom a " , len(nom) , "lettres.")

#     if est_majeur(age):
#         print('Vous etes majeur')
#     else:
#         print("Vous etes mineur")

# print("Début du programme")
# #Appel de la fonction afficher_infos
# afficher_infos(age=12)
# age = 0

# # if age != 0:  #on peut noter age = !=0 (age different de 0) ou age not == 0 (age nest pas egal a zero)
# #     print('Vous avez ' + str(age) + ' ans')
# if age == 0:
#     exit(0)# exit(code d'erreur) permet de sortir d'une condition dans le programme principal
# if est_majeur(age):
#     print('Vous etes majeur')
# else:
#     print("Vous etes mineur")



    #Refactorisation d'un code
#Refactoriser un code c'est le reecrire en ameliorant le code ..... eviter d'implementer du code 
#grace aux fonction 

# print('Fin du programme')

def demander_et_afficher_infos_personne(numero_de_personne:int):
    nom = input('Nom de la personne' + str(numero_de_personne) + " :")
    age = input('Age de la personne' + str(numero_de_personne) + " :")
    print("La personne", numero_de_personne, "Vous etes ", nom ,"et" , "vous avez ", age , "ans")
    print("Votre nom a " , len(nom) , "lettres.")
#Appel de la fonction
demander_et_afficher_infos_personne(numero_de_personne = 1)
demander_et_afficher_infos_personne(numero_de_personne = 2)
demander_et_afficher_infos_personne(numero_de_personne = 3)
