import cards

class Player:

    def __init__(self, name, amount):
        self.name = name
        self.money = amount
        self.hand = cards.Cards() 
     
    # prints out name and the hand of cards    
    def __str__(self):
        return("{}: {}".format(self.name, self.hand))
    
    def introduce(self):
        print("Hi, my name is {}".format(self.name))
    
    def addMoney(self, amount):
        self.money += amount
    
    # when player given another card, add it it player's hand    
    def addCard(self, card):
        self.hand.add(card)
        
    # when done with a round, toss cards and start with a new empty hand of cards
    def tossHand(self):
        self.hand = cards.Cards()
        

        