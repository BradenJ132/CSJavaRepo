import pygame 


#this is just a class that we are defining in order to update the attributes on an entity like velocity or size of the position
# so this is just defining the variables so we can refer to them later
class physicsentity:
    def __init__(self, game, e_type, pos, size):
        self.game = game
        self.type = e_type
        self.pos = list(pos)
        self.size = size
        self.velocity = [0,0]

    def update(self, movement=(0,0)):
#this is kind of defining more physics so bascially taking the amount of movement in one frame and then changing that based on a given velocity vector
        frame_movement = (movement[0] + self.velocity[0], movement[1] + self.velocity[1])
# this code is actually updating the position based on the earlier defined variable of frame_movement 
   
   
        self.pos[0] += frame_movement[0]
        self.pos[1] += frame_movement[1]

    def render(self, surf):
        surf.blit(self.game.assets['player'], self.pos)
    