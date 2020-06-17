import random
import card

class Cards:

    def __init__(self):
        self.cards = []
        
    # returns a string of all the cards in the 'deck'
    def __str__(self):
        s = '['
        for card in self.cards:
            if len(s) == 1:
                s = s + str(card)
            else:
                s = s + ' ' + str(card)
        s = s + ']'
        return(s)
    
    # Add card to the 'bottom' of the deck of cards
    def add(self, card):
        self.cards.append(card)
                
    # Deal card from the 'top' of the deck of cards
    def deal(self):
        return self.cards.pop(0)
        
    def shuffle(self):
        random.shuffle(self.cards)
    
        