const express = require('express');
const https =require('https');
const fs = require('fs');
require('dotenv').config();

const PORT = 1212;


const app = express();

app.use(express.json({ limit: "1kb" }));

app.post("/WebHookUpdates", (req, res)=>{
    console.log(req.body);
    res.sendStatus(200);
});


// Certificate
const privateKey = fs.readFileSync('/etc/letsencrypt/live/cstcompany.ddns.net/privkey.pem', 'utf8');
const certificate = fs.readFileSync('/etc/letsencrypt/live/cstcompany.ddns.net/cert.pem', 'utf8');
const ca = fs.readFileSync('/etc/letsencrypt/live/cstcompany.ddns.net/chain.pem', 'utf8');

const credentials = {
	key: privateKey,
	cert: certificate,
	ca: ca
};

const httpsServer = https.createServer(credentials, app);
httpsServer.listen(PORT, () => {
	console.log(`GithubWebhook is running!`);
    console.log(`Port: ${PORT}`);
});

