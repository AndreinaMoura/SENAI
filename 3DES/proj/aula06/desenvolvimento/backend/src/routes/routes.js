const express = require('express');

const router = express.Router();

const usuario = require('../controller/usuario');
const manutencao = require('../controller/manutencao');
const motorista = require('../controller/motorista');
const operacoes = require('../controller/operacoes');
const tipoVeiculos = require('../controller/tipoVeiculo');
const veiculos = require('../controller/veiculos');

router.post('/usuario/create', usuario.create);
router.post('/usuario/login', usuario.login);

router.post('/manutencao', manutencao.create);
router.get('/manutencao', manutencao.read);
router.get('/manutencao/:concluidas', manutencao.readOne);
router.put('/manutencao/:id/:veiculo', manutencao.update);
router.delete('/manutencao/:id', manutencao.remove);

router.post('/motorista', motorista.create);
router.get('/motorista', motorista.read);
router.get('/motorista/:ocupado', motorista.readOne);
router.put('/motorista/:id', motorista.update);
router.delete('/motorista/:id', motorista.remove);

router.post('/operacoes', operacoes.create);
router.get('/operacoes', operacoes.read);
router.get('/operacoes/:concluidas', operacoes.readOne);
router.put('/operacoes/:id/:veiculo/:motorista', operacoes.update);
router.delete('/operacoes/:id', operacoes.remove);

router.post('/tipoVeiculos', tipoVeiculos.create);
router.get('/tipoVeiculos', tipoVeiculos.read);
router.get('/tipoVeiculos/:id', tipoVeiculos.readOne);
router.put('/tipoVeiculos/:id', tipoVeiculos.update);
router.delete('/tipoVeiculos/:id', tipoVeiculos.remove);

router.post('/veiculos', veiculos.create);
router.get('/veiculos', veiculos.read);
router.get('/veiculos/:uso', veiculos.readOne);
router.put('/veiculos/:id', veiculos.update);
router.delete('/veiculos/:id', veiculos.remove);

module.exports = router;