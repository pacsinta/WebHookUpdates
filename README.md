# WebHookUpdates
This program can run a custom command when a webhook is received. 

## Configuration
To Configure the program, you need to edit the `application.conf` file under the src/main/resources folder.
It is a [HOCON](https://github.com/lightbend/config/blob/main/HOCON.md#hocon-human-optimized-config-object-notation) file, where you can define what should the program do to different webhooks.


Under the `deployment` section, you can define the port where the program should listen to webhooks, and the os on which the program is running.

Under the `webhooks` section, you can define the webhooks, and the command that should be run when the webhook is received.
You can define multiple webhooks and commands. 

The webhooks should have the following parameters:
- `repo`: The name of the repository that the webhook is from.
- `command`: Defines the command that should be run when the webhook is received.

You can also override these parameters for each webhook:
- `url`: Defines the url where the program should listen for the webhooks. (By default it is the repository name: /{repo})
- `asyn`: If set to true, the program will run the command in a new thread. (By default it is false)
- `timeoutSeconds`: Defines the timeout for the command. In async mode it has no effect! (By default it is 10 seconds)