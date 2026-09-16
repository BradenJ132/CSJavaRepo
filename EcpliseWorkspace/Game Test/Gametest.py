import pygame
import sys 
from Scripts.entities import physicsentity

class game:
    def __init__(self):
        self.facing_right = False

        pygame.init()

        pygame.display.set_caption("Platformer game")

        self.screen = pygame.display.set_mode((1920, 1080)) #og was 640 by 480

        self.clock = pygame.time.Clock()
        self.frogimg = pygame.image.load("Frogimg.gif").convert_alpha()
        self.frogimg.set_colorkey((255, 255, 255))
   # this is setting the default movement and posoition of the surface  
        self.frogimg_pos = [100, 200]
        self.ymovement = [False, False]
        self.xmovement = [False, False]

#this is simply a rectangle that is created on the screen (x, y postion then widght and height)
        self.collision_area = pygame.Rect(200, 200, 1000, 1000)
        

#this sets a constant for the movement speed 
        self.movement_speed = 5

    def run(self):
        running = True
        while running:
            
            Current_image = pygame.transform.flip(self.frogimg, True, False)
#the first part of the code say, get the position then you are saying get the ymovement based on the operation. it basically is stating 
# if the first value[1] is greater than [0] then move down because postive y is in the downwards direction and if [1]<[0] move up
            self.frogimg_pos[1] += (self.ymovement[1] - self.ymovement[0]) * self.movement_speed
            self.frogimg_pos[0] += (self.xmovement[1] - self.xmovement[0]) * self.movement_speed

# this allows for collison by drawing a rectangle around the image
            Frogimg_hitbox = pygame.Rect(self.frogimg_pos[0], self.frogimg_pos[1], self.frogimg.get_width(), self.frogimg.get_height())

# in a single frame it is saying if the img_r collides with the rect named self collision area then draw the rect that is named self.colliosion
# as purple. and if it is not colliding then draw the rect as blue 
            if Frogimg_hitbox.colliderect(self.collision_area):
                pygame.draw.rect(self.screen,("purple"), self.collision_area)
            else:
                pygame.draw.rect(self.screen,("blue"), self.collision_area)
            #the reason this works is because below when the key is pressed down it is only called then, and not when it is up so it 
            # basically toggles the value and when the left key is pressed it toggles it off so it will continue facing even when movement = 0
            if self.facing_right:
                self.screen.blit(Current_image, self.frogimg_pos)
            else: 
                self.screen.blit(self.frogimg, self.frogimg_pos)
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    pygame.quit() #this closes pygame. (both commands are needed)
                    sys.exit() #this codes the X in the top right to close the window.

#this whole section until the next comment is defining the vertical movement 
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_w:
                        self.ymovement[0] = True
                    if event.key == pygame.K_s:
                        self.ymovement[1] = True
                if event.type == pygame.KEYUP:
                    if event.key == pygame.K_w:
                        self.ymovement[0] = False
                    if event.key == pygame.K_s:
                        self.ymovement[1] = False
#this whole secttion is defining the horizontal movement, along with the "toggle" for the flip function 
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_a:
                        self.xmovement[0] = True
                        self.facing_right = False
                    if event.key == pygame.K_d:
                        self.xmovement[1] = True
                        self.facing_right = True
                if event.type == pygame.KEYUP:
                    if event.key == pygame.K_a:
                        self.xmovement[0] = False
                    if event.key == pygame.K_d:
                        self.xmovement[1] = False                
    

            pygame.display.flip()
            self.clock.tick(60)  

            self.screen.fill((0,0,0))
game().run()