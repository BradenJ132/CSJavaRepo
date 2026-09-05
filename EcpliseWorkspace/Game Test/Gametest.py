import pygame
import sys 
class game:
    def __init__(self):


        pygame.init()

        pygame.display.set_caption("Platformer game")

        self.screen = pygame.display.set_mode((640, 480))
        
        self.clock = pygame.time.Clock()
        self.frogimg = pygame.image.load("Frogimg.gif").convert_alpha()
        self.screen.fill("black")
        self.frogimg_pos = [100, 200]
        self.ymovement = [False, False]
        self.xmovement = [False, False]

     


    def run(self):
        running = True
        while running:

#the first part of the code say, get the position then you are saying get the ymovement based on the operation. it basically is stating 
# if the first value[1] is greater than [0] then move down because postive y is in the downwards direction and if [1]<[0] move up
            self.frogimg_pos[1] += self.ymovement[1] - self.ymovement[0] 
            self.frogimg_pos[0] += self.xmovement[1] - self.xmovement[0]
            self.screen.blit(self.frogimg, self.frogimg_pos)

          
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    pygame.quit() #this closes pygame. (both commands are needed)
                    sys.exit() #this codes the X in the top right to close the window.
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

                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_a:
                        self.xmovement[0] = True
                    if event.key == pygame.K_d:
                        self.xmovement[1] = True
                if event.type == pygame.KEYUP:
                    if event.key == pygame.K_a:
                        self.xmovement[0] = False
                    if event.key == pygame.K_d:
                        self.xmovement[1] = False                
    

            pygame.display.flip()
            self.clock.tick(60)  

game().run()