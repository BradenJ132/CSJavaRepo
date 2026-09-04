import pygame
import sys 
class game:
    def __init__(self):


        pygame.init()

        pygame.display.set_caption("Platformer game")

        self.screen = pygame.display.set_mode((640, 480))

        self.clock = pygame.time.Clock()
        self.frogimg = pygame.image.load("Frogimg.gif").convert_alpha()
    
        self.frogimg_pos = [100, 200]


     


    def run(self):
        running = True
        while running:
            self.screen.blit(self.frogimg, self.frogimg_pos)

            #gets user input so any input coming from the keyboard, files, or windows in general must have this command
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    pygame.quit() #this closes pygame. (both commands are needed)
                    sys.exit() #this codes the X in the top right to close the window.
                    

            pygame.display.flip()
            self.clock.tick(60)  

game().run()