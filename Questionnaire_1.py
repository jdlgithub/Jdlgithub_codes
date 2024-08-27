

#Projet questionnaire 
# print("Bienvenue au questionnaire_1 de Jdl")
def questionnaire(question,rep_1,rep_2,rep_3,rep_4,bonne_reponse):
    
    print(question)
    print("a:" + rep_1)
    print("b:" + rep_2)
    print("c:" + rep_3)
    print("d:" + rep_4)

    reponse = str(input('Entrer votre reponse : a,b,c ou d '))
    print(reponse)
    if reponse == bonne_reponse:
        print("Bonne reponse")
    else:
        print('Mauvaise reponse! la reponse etait ' + bonne_reponse)

# #Pose les question 
questionnaire("Question 1 : Quel est la formule de la surface d'un carré ?","c+c","cxc","c/c","2xc","b")
questionnaire("Question 2 : Quel es la formule de l'energie mecanique ?","Ec-Ep","Ep/Ec","Ec+Ep",'EcxEp', "c")
print("Merci d'avoir participer")

#Gerer un score
print("Bienvenue au questionnaire_1 de Jdl")
def questionnaire(question,rep_1,rep_2,rep_3,rep_4,bonne_reponse):
    global score 
    print(question)
    print("a:" + rep_1)
    print("b:" + rep_2)
    print("c:" + rep_3)
    print("d:" + rep_4)
    print()

    reponse = str(input('Entrer votre reponse : a,b,c ou d '))
    print(reponse)
    if reponse == bonne_reponse:
        print("Bonne reponse")
        score += 1
    else:
        print('Mauvaise reponse! la reponse etait ' + bonne_reponse)

score = 0
#Pose les question 
questionnaire("Question 1 : Quel est la formule de la surface d'un carré ?","c+c","cxc","c/c","2xc","b")
questionnaire("Question 2 : Quel es la formule de l'energie mecanique ?","Ec-Ep","Ep/Ec","Ec+Ep",'EcxEp', "c")
print("Votre score est de " + str(score) + "/2")
print("Merci d'avoir participer.")

