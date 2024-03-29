const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const create = async (req, res) => {
    let { veiculo, descricao, valor, data } = req.body
    data = new Date(req.body.data_fim)

    const [manutencao] = await prisma.$transaction([
        prisma.manutencao.create({
            data: {
                veiculo: veiculo,
                valor: valor,
                descricao: descricao,
                data_fim: data
            },
        }),
                prisma.veiculos.update({
                where: {
                    id: veiculo
                },
                data: {
                    uso: true
                }

        }),
       
    ]);
    res.status(201).json(manutencao).end();
}

const read = async (req, res) => {
    let manutencao = await prisma.manutencao.findMany({
        select: {
            id: true,
            veiculo: true,
            data_inicio: true,
            valor: true,
            descricao: true,
            data_fim: true,
            manutencao: true
        }
    });

    res.status(200).json(manutencao).end();
}


const parseBoolean = (b) => {
    if (b == 1)
        return true
    else
        return false
}

const readOne = async (req, res) => {
    let manutencao = await prisma.manutencao.findMany({
        where: {
               concluidas: parseBoolean(req.params.concluidas)
           
        }
    });

    res.status(200).json(manutencao).end();
}

const update = async (req, res) => {
    const [manutencao] = await prisma.$transaction([
        prisma.manutencao.update({
            where: {
                id: Number(req.params.id)
            },
            data: {
                data_fim:  new Date(),
                concluidas: true
            }
        }),

        prisma.veiculos.update({
            where: {
                id: Number(req.params.veiculo)
            },
            data: {
                uso: false
            }
        })
    ]);

    res.status(200).json(manutencao).end()
}

const remove = async (req, res) => {
    const manutencao = await prisma.manutencao.delete({
        where: {
            id: Number(req.params.id)
        }
    })
    res.status(200).json(manutencao).end()
}



module.exports = {
    create,
    read,
    readOne,
    update,
    remove

}
